unit Unit1;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, ExtCtrls, ToolWin, ComCtrls, Menus, ImgList;

type
  TForm1 = class(TForm)
    ctrlbr1: TControlBar;
    tlb1: TToolBar;
    btn1: TToolButton;
    btn2: TToolButton;
    btn3: TToolButton;
    mm1: TMainMenu;
    mniF1: TMenuItem;
    mniN1: TMenuItem;
    mniN2: TMenuItem;
    mniN3: TMenuItem;
    mniN4: TMenuItem;
    mniN5: TMenuItem;
    mniE1: TMenuItem;
    mniH1: TMenuItem;
    tlb2: TToolBar;
    btn4: TToolButton;
    btn5: TToolButton;
    btn6: TToolButton;
    btn7: TToolButton;
    btn8: TToolButton;
    btn9: TToolButton;
    btn10: TToolButton;
    btn11: TToolButton;
    btn12: TToolButton;
    il2: TImageList;
    StatusBar1: TStatusBar;
    pnl1: TPanel;
    procedure btn1MouseMove(Sender: TObject; Shift: TShiftState; X,
      Y: Integer);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  Form1: TForm1;

implementation

{$R *.dfm}

procedure TForm1.btn1MouseMove(Sender: TObject; Shift: TShiftState; X,
  Y: Integer);
begin
  StatusBar1.Panels.Items[1].Text := TToolButton(Sender).Caption;
end;

end.

