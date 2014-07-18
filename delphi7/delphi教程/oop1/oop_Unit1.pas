unit oop_Unit1;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, StdCtrls;

type
  TForm1 = class(TForm)
    Button1: TButton;
    procedure Button1Click(Sender: TObject);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

type
  // ����һ����
  TPerson = class
  private
    AHeight: Real;
  public
    constructor Create; // ���캯��
    destructor Destroy; // ��������
    // class function getClassName: string; //�෽��
    procedure DoJob; virtual; // ����Ϊ�鷽����̬�������Ա㸲��
  protected
    // procedure Speak;
  published
    // property AEducation: string;
  end;

type
  TStudent = class(TPerson)
  public
    //override �ؼ��ֱ������ǻ�����鷽����̬����
    procedure DoJob; override;
  end;

var
  Form1: TForm1;
  person: TPerson; // ��������

implementation

{$R *.dfm}

constructor TPerson.Create;
begin
  inherited;
end;

destructor TPerson.Destroy;
begin
  inherited Destroy;
end;
{�෽����ô��}
//class TPerson.getClassName;
//begin
//  // todo
//end;

procedure TPerson.DoJob;
begin
  ShowMessage('My job is SomeThing.');
end;

procedure TStudent.DoJob;
begin
  ShowMessage('My job is Student.');
end;

procedure TForm1.Button1Click(Sender: TObject);
var
  MyString: string;
begin
  if Button1 is TButton then
  begin
    TButton(Button1).Caption := '������� is';
  end;

  with Sender as TButton do
  begin
    Caption := '������� as';
  end;


  try
    person := TPerson.Create;// ʵ��������
    // add code here
    // MyString := person.getClassName;
  finally
    person.Free;
  end;
end;
end.

