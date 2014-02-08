unit Unit8_3;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, cxStyles, cxCustomData, cxGraphics, cxFilter, cxData,
  cxDataStorage, cxEdit, DB, cxDBData, StdCtrls, cxGridLevel, cxClasses,
  cxControls, cxGridCustomView, cxGridCustomTableView, cxGridTableView,
  cxGridDBTableView, cxGrid, ExtCtrls, DBCtrls, Grids, DBGrids, Mask,
  DBTables, ComCtrls;

type
  TForm1 = class(TForm)
    GroupBox1: TGroupBox;
    Table1: TTable;
    DataSource1: TDataSource;
    Label1: TLabel;
    Label2: TLabel;
    Label3: TLabel;
    Label4: TLabel;
    Label5: TLabel;
    Label6: TLabel;
    DBEdit1: TDBEdit;
    DBEdit2: TDBEdit;
    DBEdit3: TDBEdit;
    DBEdit4: TDBEdit;
    DBRadioGroup1: TDBRadioGroup;
    DBComboBox1: TDBComboBox;
    DBCheckBox1: TDBCheckBox;
    DBMemo1: TDBMemo;
    DBImage1: TDBImage;
    DBGrid1: TDBGrid;
    DBNavigator1: TDBNavigator;
    saveBtn: TButton;
    queryBtn: TButton;
    quitBtn: TButton;
    cancelBtn: TButton;
    delBtn: TButton;
    addBtn: TButton;
    locateBtn: TButton;
    updateBtn: TButton;
    StatusBar1: TStatusBar;
    procedure DataSource1DataChange(Sender: TObject; Field: TField);
    procedure addBtnClick(Sender: TObject);
    procedure delBtnClick(Sender: TObject);
    procedure updateBtnClick(Sender: TObject);
    procedure locateBtnClick(Sender: TObject);
    procedure queryBtnClick(Sender: TObject);
    procedure saveBtnClick(Sender: TObject);
    procedure cancelBtnClick(Sender: TObject);
    procedure quitBtnClick(Sender: TObject);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  Form1: TForm1;

implementation

{$R *.dfm}

procedure TForm1.DataSource1DataChange(Sender: TObject; Field: TField);
begin
  if Table1.State = dsInsert then
    StatusBar1.Panels[0].Text := '数据表处于插入状态';
  if Table1.State = dsEdit then
    StatusBar1.Panels[0].Text := '数据表处于编辑状态';
  if Table1.State = dsBrowse then
    StatusBar1.Panels[0].Text := '数据表处于浏览状态';
  if Table1.State = dsSetKey then
    StatusBar1.Panels[0].Text := '数据表处于查询状态';

end;

procedure TForm1.addBtnClick(Sender: TObject);
begin
  if Table1.CanModify then
  begin
    Table1.Append; // !!
//    GroupBox1.Enabled := true;
//    DBNavigator1.Enabled := False;
//    saveBtn.Enabled := False;
//    delBtn.Enabled := False;
//    updateBtn.Enabled := False;
//    locateBtn.Enabled := False;
//    queryBtn.Enabled := False;
//    saveBtn.Enabled := False;
//    quitBtn.Enabled := False;
  end
  else
    ShowMessage('当前数据表不能新增数据');

end;

procedure TForm1.delBtnClick(Sender: TObject);
begin
  if MessageDlg('确实要删除吗？', mtInformation, [mbOK, mbCancel], 0) = mrOk
    then
    Table1.Delete;

end;

procedure TForm1.updateBtnClick(Sender: TObject);
begin
  if Table1.CanModify then
  begin
    Table1.Edit; // !!
//    GroupBox1.Enabled := True;
//    DBNavigator1.Enabled := False;
//
//    saveBtn.Enabled := False;
//    delBtn.Enabled := False;
//    updateBtn.Enabled := False;
//    locateBtn.Enabled := False;
//    queryBtn.Enabled := False;
//    saveBtn.Enabled := False;
//    quitBtn.Enabled := False;
  end
  else
    ShowMessage('当前表数据不能修改');

end;

procedure TForm1.locateBtnClick(Sender: TObject);
var
  i, code: Integer;
  scope: string;
begin
  repeat
    scope := InputBox('移动指针位置', '请输入移动距离：', '0'); // !!
    Val(scope, i, code);   // ?
    if code <> 0 then
      ShowMessage('你输入了一个错误的移动范围，请重试！');
  until code = 0;
  Table1.MoveBy(i);

end;

procedure TForm1.queryBtnClick(Sender: TObject);
begin
  // TODO
end;

procedure TForm1.saveBtnClick(Sender: TObject);
begin
  if Table1.Modified then
  begin
    Table1.Post;
    //GroupBox1.Enabled := False;
//    DBNavigator1.Enabled := True;
//    saveBtn.Enabled := True;
//    delBtn.Enabled := True;
//    updateBtn.Enabled := True;
//    locateBtn.Enabled := True;
//    queryBtn.Enabled := True;
//    saveBtn.Enabled := True;
//    quitBtn.Enabled := True;
  end;

end;

procedure TForm1.cancelBtnClick(Sender: TObject);
begin
  Table1.Cancel;
//  GroupBox1.Enabled:= False;
//  DBNavigator1.Enabled := True;
//  saveBtn.Enabled := True;
//  delBtn.Enabled := True;
//  updateBtn.Enabled := True;
//  locateBtn.Enabled := True;
//  queryBtn.Enabled := True;
//  saveBtn.Enabled := True;
//  quitBtn.Enabled := True;
end;

procedure TForm1.quitBtnClick(Sender: TObject);
begin
  Close;
end;

end.

