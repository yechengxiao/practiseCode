program Project1_1;

uses
  Forms,
  Unit1_1 in 'Unit1_1.pas' {Form1};

{$R *.res}

begin
  Application.Initialize;
  Application.CreateForm(TForm1, Form1);
  Application.Run;
end.
