unit U_Dialog;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, StdCtrls, ExtCtrls;

type
  TForm1 = class(TForm)
    PrintDialog1: TPrintDialog;
    SaveDialog1: TSaveDialog;
    OpenDialog1: TOpenDialog;
    FontDialog1: TFontDialog;
    ColorDialog1: TColorDialog;
    OpenBtn: TButton;
    SaveBtn: TButton;
    FontBtn: TButton;
    ColorBtn: TButton;
    FindBtn: TButton;
    ReplaceBtn: TButton;
    MessageBtn: TButton;
    InputBtn: TButton;
    Memo1: TMemo;
    FindDialog1: TFindDialog;
    ReplaceDialog1: TReplaceDialog;
    procedure OpenBtnClick(Sender: TObject);
    procedure SaveBtnClick(Sender: TObject);
    procedure FontBtnClick(Sender: TObject);
    procedure ColorBtnClick(Sender: TObject);
    procedure FindBtnClick(Sender: TObject);
    procedure ReplaceBtnClick(Sender: TObject);
    procedure MessageBtnClick(Sender: TObject);
    procedure InputBtnClick(Sender: TObject);
    procedure FontDialog1Apply(Sender: TObject; Wnd: HWND);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  Form1: TForm1;

implementation

{$R *.dfm}

procedure TForm1.OpenBtnClick(Sender: TObject);
begin
  with OpenDialog1 do
  begin
    if Execute then // 非可视组件的执行
    begin
      if ofExtensionDifferent in Options then // 过滤文件类型，需要设置filter属性
        MessageDlg('非文本文件！', mtError, [mbOK], 0)
      else
        Memo1.Lines.LoadFromFile(FileName);  // memo读入文件
    end;
  end;
end;

procedure TForm1.SaveBtnClick(Sender: TObject);
begin
  if SaveDialog1.Execute then
    Memo1.Lines.SaveToFile(SaveDialog1.FileName);
end;

procedure TForm1.FontBtnClick(Sender: TObject);
begin
  FontDialog1.Font := Memo1.Font;
  if FontDialog1.Execute then
    Memo1.Font := FontDialog1.Font;
end;

procedure TForm1.ColorBtnClick(Sender: TObject);
begin
  with ColorDialog1 do
  begin
    ColorDialog1.Color := Memo1.Color;
    if Execute then
      Memo1.Color := ColorDialog1.Color;
  end;
end;

procedure TForm1.FindBtnClick(Sender: TObject);
begin
  FindDialog1.Execute;
end;

procedure TForm1.ReplaceBtnClick(Sender: TObject);
begin
  ReplaceDialog1.Execute;
end;

procedure TForm1.MessageBtnClick(Sender: TObject);
begin
  ShowMessage('你单击的是消息框按钮!');
end;



procedure TForm1.InputBtnClick(Sender: TObject);
var
  ch: string;
begin
  ch := InputBox('菜单', '请选择：' + chr(13) +   // 输入框
    '1. 录入' + chr(13) +
    '2. 修改 ' + chr(13) +
    '3. 删除 ' + chr(13), '1');

  if ch = '1' then
    ShowMessage('录入');
  if ch = '2' then
    ShowMessage('修改');
  if ch = '3' then
    ShowMessage('删除');
end;

procedure TForm1.FontDialog1Apply(Sender: TObject; Wnd: HWND); // ??
begin
  Memo1.Font := FontDialog1.Font;
end;

// 查找替换未实现

end.

