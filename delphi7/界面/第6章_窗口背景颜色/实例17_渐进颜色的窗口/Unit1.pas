unit Unit1;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs;

type
  TForm1 = class(TForm)
    procedure FormResize(Sender: TObject);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  Form1: TForm1;

implementation

{$R *.dfm}

procedure TForm1.FormResize(Sender: TObject);
var
  i: Word;
  dy, y: Real;
begin
  // 像素间隔
  dy := ClientHeight / 256;

  // 记录当前所画高度
  y := 0;

  // 循环填充颜色
  for i := 0 to 255 do
  begin
    // 设定不同深浅的颜色
    Canvas.Brush.Color := $02FFFFFF - i*$10000;

    // 在一定区域内填充设定的颜色
    Canvas.FillRect(Rect(0, Round(y), ClientWidth, Round(y + dy)));

    // 高度增加
    y := y + dy;
  end;
end;

end.

 