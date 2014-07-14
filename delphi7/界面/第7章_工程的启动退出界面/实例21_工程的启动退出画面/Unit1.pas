unit Unit1;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs;

type
  TForm1 = class(TForm)
    procedure FormClose(Sender: TObject; var Action: TCloseAction);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  Form1: TForm1;

implementation

uses Unit3;

{$R *.dfm}

procedure TForm1.FormClose(Sender: TObject; var Action: TCloseAction);
begin
  // 当前窗口隐藏
  Form1.Hide;

  begin
    Form3 := TForm3.Create(Self);
    Form3.Show;
    Form3.Update; // ??

    //Application.CreateForm(TForm1, Form1); // ??

    Sleep(2000);

    Form3.Hide;
    Form3.Free;
  end;

  // Form1.Free;  // 进程无法结束
end;

end.

