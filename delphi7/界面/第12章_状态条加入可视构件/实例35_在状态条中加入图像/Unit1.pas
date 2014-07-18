unit Unit1;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, ComCtrls, StdCtrls, Mask, ExtCtrls;

type
  TForm1 = class(TForm)
    StatusBar1: TStatusBar;
    btn1: TButton;
    img1: TImage;
    procedure btn1Click(Sender: TObject);
    procedure StatusBar1DrawPanel(StatusBar: TStatusBar;
      Panel: TStatusPanel; const Rect: TRect);
  private
    { Private declarations }
    DrawRect: TRect;
  public
    { Public declarations }
  end;

var
  Form1: TForm1;

implementation

{$R *.dfm}

procedure TForm1.btn1Click(Sender: TObject);
begin
  with img1 do
  begin

    Parent := StatusBar1;
    // 定义位置
    Top := DrawRect.Top;
    Left := DrawRect.Left + 7;
    // 定义大小
    Height := DrawRect.Bottom - DrawRect.Top;
    Width := DrawRect.Right - DrawRect.Left;
    // 使图片可见
    Visible := True;
  end;
end;

procedure TForm1.StatusBar1DrawPanel(StatusBar: TStatusBar;
  Panel: TStatusPanel; const Rect: TRect);
begin
  DrawRect := Rect;
end;

end.

