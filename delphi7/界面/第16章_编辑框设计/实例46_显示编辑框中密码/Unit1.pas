unit Unit1;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, ToolWin, ComCtrls, StdCtrls;

type
  TForm1 = class(TForm)
    clbr1: TCoolBar;
    tlb1: TToolBar;
    Edit1: TEdit;
    btn1: TToolButton;
    procedure btn1Click(Sender: TObject);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  Form1: TForm1;

implementation

{$R *.dfm}

procedure TForm1.btn1Click(Sender: TObject);
begin
  if btn1.Down then // 按钮被按下，按钮style为tbsCheck
  begin
    Edit1.Cursor := crArrow;
    Edit1.Hint := Edit1.Text;
  end
  else
  begin
    Edit1.Cursor := crDefault; // 光标
    Edit1.Hint := '';
  end;
end;

end.

