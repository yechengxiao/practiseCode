unit Ulabel;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, StdCtrls, Mask;

type
  TfrmLabel1 = class(TForm)
    lblDown: TLabel;
    lblUp: TLabel;
    btnLeft: TButton;
    BtnRight: TButton;
    Edit1: TEdit;
    MaskEdit1: TMaskEdit;
    procedure btnLeftClick(Sender: TObject);
    procedure BtnRightClick(Sender: TObject);
    procedure Edit1KeyPress(Sender: TObject; var Key: Char);
    procedure Edit1Change(Sender: TObject);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  frmLabel1: TfrmLabel1;

implementation

{$R *.dfm}

procedure TfrmLabel1.btnLeftClick(Sender: TObject);
begin
  lblUp.Left := lblDown.left - 4;
end;

procedure TfrmLabel1.BtnRightClick(Sender: TObject);
begin
  lblUp.Left := lblDown.left + 4;
end;

procedure TfrmLabel1.Edit1KeyPress(Sender: TObject; var Key: Char);
begin
  if not (Key in ['0'..'9', #8]) then // 删除键#8
  begin
    key := #0; // #0 为空，表示没有输入
  end;
end;

procedure TfrmLabel1.Edit1Change(Sender: TObject);
// Edit1 中的内容为“123456”时，使 Button1 生效，同时将输入焦点转移到 Button 1 上。
begin
  if Edit1.Text = '123456' then
  begin
    btnLeft.Enabled := True;
    self.FocusControl(btnLeft);
  end;
end;

end.

