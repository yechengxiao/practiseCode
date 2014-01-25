program Plabel;

uses
  Forms,
  Ulabel in 'Ulabel.pas' {frmLabel1};

{$R *.res}

begin
  Application.Initialize;
  Application.CreateForm(TfrmLabel1, frmLabel1);
  Application.Run;
end.
