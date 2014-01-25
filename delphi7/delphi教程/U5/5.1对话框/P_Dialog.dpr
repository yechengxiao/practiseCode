program P_Dialog;

uses
  Forms,
  U_Dialog in 'U_Dialog.pas' {Form1};

{$R *.res}

begin
  Application.Initialize;
  Application.CreateForm(TForm1, Form1);
  Application.Run;
end.
