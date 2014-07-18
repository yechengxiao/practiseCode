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
  // 定义一个类
  TPerson = class
  private
    AHeight: Real;
  public
    constructor Create; // 构造函数
    destructor Destroy; // 析构函数
    // class function getClassName: string; //类方法
    procedure DoJob; virtual; // 声明为虚方法或动态方法，以便覆盖
  protected
    // procedure Speak;
  published
    // property AEducation: string;
  end;

type
  TStudent = class(TPerson)
  public
    //override 关键字表明覆盖基类的虚方法或动态方法
    procedure DoJob; override;
  end;

var
  Form1: TForm1;
  person: TPerson; // 声明对象

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
{类方法怎么搞}
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
    TButton(Button1).Caption := '类操作符 is';
  end;

  with Sender as TButton do
  begin
    Caption := '类操作符 as';
  end;


  try
    person := TPerson.Create;// 实例化对象
    // add code here
    // MyString := person.getClassName;
  finally
    person.Free;
  end;
end;
end.

