program P_toolbar;

uses
  Forms,
  U_toolbar in 'U_toolbar.pas' {Form1};

{$R *.res}

begin
  Application.Initialize;
  Application.CreateForm(TForm1, Form1);
  Application.Run;
end.
