program Project1;

uses
  Windows, Forms,
  Unit1 in 'Unit1.pas' {Form1},
  Unit2 in 'Unit2.pas' {Form2},
  Unit3 in 'Unit3.pas' {Form3};

{$R *.res}

begin
  Application.Initialize;

  Form2 := TForm2.Create(Form2);
  Form2.Show;
  Form2.Update;

  Application.CreateForm(TForm1, Form1);
  Sleep(2000);

  Form2.Hide;
  Form2.Free;

  Application.Run;
end.

