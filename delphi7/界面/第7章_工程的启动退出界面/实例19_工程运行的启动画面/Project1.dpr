program Project1;

uses
  Windows, Forms,
  Unit1 in 'Unit1.pas' {Form1},
  Unit2 in 'Unit2.pas' {Form2};

{$R *.res}

begin
  Application.Initialize;

  // �����������洰��
  Form2 := TForm2.Create(Form2);

  // ��ʾ�������洰��
  Form2.Show;
  Form2.Update;

  //  �������̴���
  Application.CreateForm(TForm1, Form1);

  Sleep(2000);

  Form2.Hide;
  Form2.Free;

  Application.Run;

end.

