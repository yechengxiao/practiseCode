unit U_list;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, StdCtrls;

type
  TForm1 = class(TForm)
    ListBox1: TListBox;
    Button1: TButton;
    Button2: TButton;
    procedure Button1Click(Sender: TObject);
    procedure ListBox_add(strList: TStringList);
    procedure Button2Click(Sender: TObject);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  Form1: TForm1;

implementation

{$R *.dfm}

procedure TForm1.Button1Click(Sender: TObject);
var
  strList1: TStringList;
begin
  // 这么写是否多余
  strList1 := TStringList.Create;

  strList1.Clear;
  strList1.Add('北京');
  strList1.Add('添加');
  strList1.Add('石家庄');

  ListBox_add(strList1);
  strList1.Free;
end;

procedure TForm1.ListBox_add(strList: TStringList);
var
  i: Integer;
  len: integer;
begin
  len := (strList.count - 1);
  for i := 0 to len do
  begin
    ListBox1.Items.add(strList[i]);
  end;
end;

procedure TForm1.Button2Click(Sender: TObject);
begin
  ListBox1.Clear;
end;

end.

