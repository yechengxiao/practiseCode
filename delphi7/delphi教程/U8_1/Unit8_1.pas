unit Unit8_1;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, ExtCtrls, DBCtrls, Grids, DBGrids, StdCtrls, DB, DBTables;

type
  TForm1 = class(TForm)
    DataSource1: TDataSource;
    Table1: TTable;
    DBImage1: TDBImage;
    DBMemo1: TDBMemo;
    DBGrid1: TDBGrid;
    DBNavigator1: TDBNavigator;
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  Form1: TForm1;

implementation

{$R *.dfm}
end.
