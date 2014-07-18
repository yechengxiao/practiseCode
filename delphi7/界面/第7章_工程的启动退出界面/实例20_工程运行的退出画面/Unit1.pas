unit Unit1;

interface

uses
  Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
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

uses Windows, Unit2;

{$R *.dfm}

procedure TForm1.FormClose(Sender: TObject; var Action: TCloseAction);
begin
  Form1.Hide;
  Form2 := TForm2.Create(Form1);
  Form2.Show;
  Form2.Update;
  Application.CreateForm(TForm, Form1);
  Sleep(2000);
  Form2.Hide;
  Form2.Free;
end;

end.

 