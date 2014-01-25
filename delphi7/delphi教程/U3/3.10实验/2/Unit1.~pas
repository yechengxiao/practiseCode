unit Unit1;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, StdCtrls;

type
  TForm1 = class(TForm)
    ListBox1: TListBox;
    ListBox2: TListBox;
    allRightBtn: TButton;
    RightBtn: TButton;
    LeftBtn: TButton;
    allLeftBtn: TButton;
    upBtn: TButton;
    downBtm: TButton;
    exitBtn: TButton;
    Label1: TLabel;
    Label2: TLabel;
    procedure exchangeSide(fromLBox: TListBox; toLBox: TListBox);
    procedure exchangeAll(fromLBox: TListBox; toLBox: TlistBox);
    procedure allRightBtnClick(Sender: TObject);
    procedure RightBtnClick(Sender: TObject);
    procedure LeftBtnClick(Sender: TObject);
    procedure allLeftBtnClick(Sender: TObject);
    procedure upBtnClick(Sender: TObject);
    procedure downBtmClick(Sender: TObject);
    procedure exitBtnClick(Sender: TObject);
    procedure FormClose(Sender: TObject; var Action: TCloseAction);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  Form1: TForm1;

implementation

{$R *.dfm}

procedure TForm1.exchangeSide(fromLBox: TListBox; toLBox: TListBox);
var
  i: Integer;
begin
  for i := 0 to fromLBox.Items.Count - 1 do
  begin
    if fromLBox.Selected[i] then // 循环来判断listbox的选中情况
    begin
      toLBox.Items.Add(fromLBox.Items.Strings[i]);
      fromLBox.Items.Delete(i);
      break;
    end;
  end;
end;

procedure TForm1.exchangeAll(fromLBox: TListBox; toLBox: TlistBox);
var
  i: Integer;
begin
  for i := 0 to fromLBox.Items.Count - 1 do
  begin
    // toLBox.Items.Strings[i] --> listBox的当前值
    toLBox.Items.Add(fromLBox.Items.Strings[i]);
  end;
  fromLBox.Clear;
end;

procedure TForm1.allRightBtnClick(Sender: TObject);
begin
  exchangeAll(ListBox1, ListBox2);
end;

procedure TForm1.RightBtnClick(Sender: TObject);
begin
  exchangeSide(ListBox1, ListBox2);
end;

procedure TForm1.LeftBtnClick(Sender: TObject);
begin
  exchangeSide(ListBox2, ListBox1);
end;

procedure TForm1.allLeftBtnClick(Sender: TObject);
begin
  exchangeAll(ListBox2, ListBox1);
end;

procedure TForm1.upBtnClick(Sender: TObject);
var
  i: integer;
  currentLBox: TListBox;
  str: string;
begin
  currentLbox := ListBox1;
  for i := 1 to currentLBox.Items.Count - 1 do
  begin
    if currentLBox.Selected[i] and (i <> 0) then
    begin
      str := currentLBox.Items.strings[i];
      currentLBox.Items.Strings[i] := currentLBox.Items.Strings[i - 1];
      currentLBox.Items.Strings[i - 1] := str;
      currentLBox.Selected[i - 1] := True;
      break;
    end;
  end;
end;

procedure TForm1.downBtmClick(Sender: TObject);
var
  i: integer;
  currentLBox: TListBox;
  str: string;
begin
  currentLbox := ListBox1;
  for i := (currentLBox.Items.Count - 2) downto 0 do
  begin
    if currentLBox.Selected[i] and (i <> currentLBox.Items.Count - 1) then
    begin
      str := currentLBox.Items.strings[i];
      currentLBox.Items.Strings[i] := currentLBox.Items.Strings[i + 1];
      currentLBox.Items.Strings[i + 1] := str;
      currentLBox.Selected[i + 1] := True;
      break;
    end;
  end;
end;

procedure TForm1.exitBtnClick(Sender: TObject);
begin
  close;
end;

procedure TForm1.FormClose(Sender: TObject; var Action: TCloseAction);
begin
  action := caFree;
end;

end.

