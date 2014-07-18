unit Unit1;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs;

type
  TForm1 = class(TForm)
  private
    { Private declarations }
  public
    { Public declarations }
  end;
  
type
  TPerson = class
  public
    procedure DoJob; virtual;
    procedure Person_DoJob(const AllPerson: Tperson);
  end;
  TStudent = class(TPerson)
  public
    procedure DoJob; override;
  end;
  TTeacher = class(TPerson)
  public
    procedure DoJob; override;
  end;

var
  Form1: TForm1;

implementation

{$R *.dfm}

procedure TPerson.DoJob;
begin
  ShowMessage('this is father' + '''s DoJob');
end;

procedure TStudent.DoJob;
begin
  ShowMessage('this is TStudent' + '''s DoJob');
end;

procedure TTeacher.DoJob;
begin
  ShowMessage('this is TTeacher' + '''s DoJob');
end;

{===================
多态，传入派生类
====================}

procedure TPerson.Person_DoJob(const AllPerson: TPerson);
begin
  AllPerson.DoJob;
end;
end.

