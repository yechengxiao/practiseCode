program Project1;

uses
  Windows, Forms,
  Unit1 in 'Unit1.pas' {Form1},
  Unit2 in 'Unit2.pas' {Form2};

{$R *.res}

begin
  Application.Initialize;

  // 创建启动画面窗口
  Form2 := TForm2.Create(Form2);

  // 显示启动画面窗口
  Form2.Show;
  Form2.Update;

  //  创建工程窗口
  Application.CreateForm(TForm1, Form1);

  Sleep(2000);

  Form2.Hide;
  Form2.Free;

  Application.Run;

end.

