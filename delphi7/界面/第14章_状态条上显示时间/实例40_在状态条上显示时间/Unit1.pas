unit Unit1;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, ComCtrls, ExtCtrls;

type
  TForm1 = class(TForm)
    StatusBar1: TStatusBar;
    tmr1: TTimer;
    procedure tmr1Timer(Sender: TObject);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  Form1: TForm1;

implementation

{$R *.dfm}

procedure TForm1.tmr1Timer(Sender: TObject);
begin
  StatusBar1.Panels.Items[2].Text := FormatDateTime('yyyy-mm-dd HH:mm:ss', Now);
end;

end.

