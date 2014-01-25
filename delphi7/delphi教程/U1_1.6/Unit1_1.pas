unit Unit1_1;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, StdCtrls, ExtCtrls;

type
  TForm1 = class(TForm)
    Label1: TLabel;
    Timer1: TTimer;
    Button1: TButton;
    procedure Timer1Timer(Sender: TObject);
    procedure Button1Click(Sender: TObject);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  Form1: TForm1;

implementation

{$R *.dfm}

procedure TForm1.Timer1Timer(Sender: TObject);
var
  dataTime: TDateTime;
  str: string;
begin
  dataTime := Time; // 获取时间
  str := TimeToStr(dataTime);
  Label1.Caption := str;
  Beep; // 发声
end;

procedure TForm1.Button1Click(Sender: TObject);
begin
  Label1.Visible := not Label1.Visible;
end;

end.

