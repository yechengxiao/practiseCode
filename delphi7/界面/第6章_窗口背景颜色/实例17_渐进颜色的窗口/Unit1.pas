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
  // ���ؼ��
  dy := ClientHeight / 256;

  // ��¼��ǰ�����߶�
  y := 0;

  // ѭ�������ɫ
  for i := 0 to 255 do
  begin
    // �趨��ͬ��ǳ����ɫ
    Canvas.Brush.Color := $02FFFFFF - i*$10000;

    // ��һ������������趨����ɫ
    Canvas.FillRect(Rect(0, Round(y), ClientWidth, Round(y + dy)));

    // �߶�����
    y := y + dy;
  end;
end;

end.

 