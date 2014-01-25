unit U_toolbar;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, Menus, ImgList, StdCtrls, ComCtrls, Buttons, ExtCtrls;

type
  TForm1 = class(TForm)
    MainMenu1: TMainMenu;
    Files: TMenuItem;
    New: TMenuItem;
    Open: TMenuItem;
    Save: TMenuItem;
    Exit: TMenuItem;
    Edit: TMenuItem;
    Cut: TMenuItem;
    Copy: TMenuItem;
    Paste: TMenuItem;
    Formats: TMenuItem;
    Font: TMenuItem;
    Color: TMenuItem;
    Help: TMenuItem;
    About: TMenuItem;
    OpenDialog1: TOpenDialog;
    SaveDialog1: TSaveDialog;
    FontDialog1: TFontDialog;
    ColorDialog1: TColorDialog;
    ImageList1: TImageList;
    Panel1: TPanel;
    RichEdit1: TRichEdit;
    FontCmb: TComboBox;
    FontSizeCmb: TComboBox;
    newSpBtn: TSpeedButton;
    OpenSpBtn: TSpeedButton;
    SaveSpBtn: TSpeedButton;
    CutSpBtn: TSpeedButton;
    CopySpBtn: TSpeedButton;
    PasteSpBtn: TSpeedButton;
    procedure ExitClick(Sender: TObject);
    procedure SaveClick(Sender: TObject);
    procedure OpenClick(Sender: TObject);
    procedure NewClick(Sender: TObject);
    procedure CutClick(Sender: TObject);
    procedure CopyClick(Sender: TObject);
    procedure PasteClick(Sender: TObject);
    procedure FontClick(Sender: TObject);
    procedure ColorClick(Sender: TObject);
    procedure FontSizeCmbChange(Sender: TObject);
    procedure FontCmbChange(Sender: TObject);
    procedure AboutClick(Sender: TObject);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  Form1: TForm1;

implementation

{$R *.dfm}

procedure TForm1.ExitClick(Sender: TObject);
begin
  close;
end;

procedure TForm1.SaveClick(Sender: TObject);
begin
  with SaveDialog1 do
  begin
    Filter :=
      '文本文件(*.txt)|*.txt|Word文档(*.doc)|*.doc|所有文件(*.*)|*.*';
    DefaultExt := 'txt';
    if Execute then
      RichEdit1.Lines.SaveToFile(FileName);
  end;
end;

procedure TForm1.OpenClick(Sender: TObject);
begin
  with OpenDialog1 do
  begin
    Filter := '文本文件(*.txt)|*.txt|Word文档(*.doc)|*.doc|所有文件(*.*)|*.*';
    // 过滤
    DefaultExt := 'txt';
    Options := [ofHideReadOnly, OfFileMustExist, ofPathMustExist];
    if Execute then
      RichEdit1.Lines.LoadFromFile(FileName);
  end;
end;

procedure TForm1.NewClick(Sender: TObject); // 新建
begin
  RichEdit1.Clear;
end;

procedure TForm1.CutClick(Sender: TObject); // 剪切
begin
  if RichEdit1.SelLength > 0 then
    RichEdit1.CutToClipboard;
end;

procedure TForm1.CopyClick(Sender: TObject); // 复制
begin
  if RichEdit1.SelLength > 0 then
    RichEdit1.CopyToClipboard;
end;

procedure TForm1.PasteClick(Sender: TObject); // 粘贴
begin
  RichEdit1.PasteFromClipboard;
end;

procedure TForm1.FontClick(Sender: TObject); // 字体
begin
  if RichEdit1.SelLength > 0 then
  begin
    FontDialog1.Font.Assign(RichEdit1.DefAttributes); // 指派
    if FontDialog1.Execute then
      RichEdit1.SelAttributes.Assign(FontDialog1.Font); // 所选字符串的字体
  end;
end;

procedure TForm1.ColorClick(Sender: TObject); //  颜色
begin
  ColorDialog1.Color := RichEdit1.Color;
  if ColorDialog1.Execute then
    //RichEdit1.Color := ColorDialog1.Color; //  RichEdit1的背景
    RichEdit1.selAttributes.color := ColorDialog1.Color; // 所选字符串的颜色
end;

procedure TForm1.FontSizeCmbChange(Sender: TObject); // 字号
begin
  if RichEdit1.SelLength > 0 then
    RichEdit1.SelAttributes.size := StrToInt(FontSizeCmb.Text);
  // 所选字符串的字号
end;

procedure TForm1.FontCmbChange(Sender: TObject); // 字体
begin
  if RichEdit1.SelLength > 0 then
    RichEdit1.SelAttributes.name := FontCmb.Text; // 所选字符串的字体
end;

procedure TForm1.AboutClick(Sender: TObject); // 关于
begin
  MessageDlg('欢迎使用', mtInformation, [mbOK], 0);
end;

end.

