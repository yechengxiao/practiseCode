program oop_Project1;

uses
  Forms,
  oop_Unit1 in 'oop_Unit1.pas' {Form1};

{$R *.res}

begin
  Application.Initialize;
  Application.CreateForm(TForm1, Form1);
  Application.Run;
end.
