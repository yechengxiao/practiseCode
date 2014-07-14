unit Unit1;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, ExtCtrls, StdCtrls;

type
  TForm1 = class(TForm)
    tmr1: TTimer;
    lbl1: TLabel;
    procedure FormCreate(Sender: TObject);
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

procedure TForm1.FormCreate(Sender: TObject);
begin
  // TODO continue
end;

procedure TForm1.tmr1Timer(Sender: TObject);
var
  i1, i2: Integer;
begin
  // Î»ÖÃËæ»ú
//  Form1.Visible := False;
//  i1 := Random(800);
//  i2 := Random(600);
//
//  Form1.Left := i1;
//  Form1.Top := i2;
//  Form1.Visible := true;
//  Form1.Refresh;

end;

end.

