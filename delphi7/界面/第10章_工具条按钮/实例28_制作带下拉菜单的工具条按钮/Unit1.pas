unit Unit1;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, ToolWin, ComCtrls, Menus, ExtCtrls;

type
  TForm1 = class(TForm)
    clbr1: TCoolBar;
    tlb1: TToolBar;
    btn1: TToolButton;
    btn2: TToolButton;
    btn3: TToolButton;
    mm1: TMainMenu;
    mniN1: TMenuItem;
    mniN2: TMenuItem;
    mniN3: TMenuItem;
    mniN4: TMenuItem;
    mniN5: TMenuItem;
    mniN6: TMenuItem;
    StatusBar1: TStatusBar;
    tlb2: TToolBar;
    pm1: TPopupMenu;
    btn4: TToolButton;
    btn5: TToolButton;
    btn6: TToolButton;
    btn7: TToolButton;
    btn8: TToolButton;
    btn9: TToolButton;
    btn10: TToolButton;
    btn11: TToolButton;
    pnl1: TPanel;
    mniN7: TMenuItem;
    mniWord1: TMenuItem;
    mniN8: TMenuItem;
    mniN9: TMenuItem;
    mniN10: TMenuItem;
    mniN11: TMenuItem;
    procedure btn4Click(Sender: TObject);
    procedure mniN7Click(Sender: TObject);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  Form1: TForm1;

implementation

{$R *.dfm}

procedure TForm1.btn4Click(Sender: TObject);
var
  i: Integer;
begin
  //  for i := 0 to pm1.Items.Count - 1 do
  //  begin
  //    if pm1.Items[i].Default = True then
  //    begin
  //      pm1.Items[i].Click;
  //    end;
  //  end;
  pm1.Items[0].Click;
end;

procedure TForm1.mniN7Click(Sender: TObject);
begin
  ShowMessage('文本文件');
end;

end.

