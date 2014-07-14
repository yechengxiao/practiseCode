unit Unit1;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, ActnList, Menus, StdActns, ImgList, StdCtrls;

type
  TForm1 = class(TForm)
    ActionList1: TActionList;
    MainMenu1: TMainMenu;
    File1: TMenuItem;
    Windows1: TMenuItem;
    Horizon1: TMenuItem;
    Vertical1: TMenuItem;
    WindowTileHorizontal1: TWindowTileHorizontal;
    WindowTileVertical1: TWindowTileVertical;
    procedure File1Click(Sender: TObject);
    procedure WindowTileHorizontal1Execute(Sender: TObject);
    procedure WindowTileVertical1Execute(Sender: TObject);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  Form1: TForm1;

implementation

uses Unit2;

{$R *.dfm}

procedure TForm1.File1Click(Sender: TObject);
begin
  Form2 := TForm2.Create(Self);
  Form2.Show();
end;

procedure TForm1.WindowTileHorizontal1Execute(Sender: TObject);
begin
  ShowMessage('Horizontal');
end;

procedure TForm1.WindowTileVertical1Execute(Sender: TObject);
begin
  ShowMessage('Vertical');
end;

end.

