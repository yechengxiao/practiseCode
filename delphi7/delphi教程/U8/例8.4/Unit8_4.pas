unit Unit8_4;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, StdCtrls, ExtCtrls, DBCtrls, Grids, DBGrids, ComCtrls, DB,
  DBTables;

type
  TForm1 = class(TForm)
    GroupBox1: TGroupBox;
    Query1: TQuery;
    DataSource1: TDataSource;
    CheckBox1: TCheckBox;
    CheckBox2: TCheckBox;
    CheckBox3: TCheckBox;
    CheckBox4: TCheckBox;
    CheckBox5: TCheckBox;
    CheckBox6: TCheckBox;
    CheckBox7: TCheckBox;
    CheckBox8: TCheckBox;
    Edit1: TEdit;
    Edit2: TEdit;
    Edit3: TEdit;
    Edit4: TEdit;
    RadioGroup1: TRadioGroup;
    ComboBox1: TComboBox;
    DateTimePicker1: TDateTimePicker;
    DateTimePicker2: TDateTimePicker;
    DBMemo1: TDBMemo;
    DBImage1: TDBImage;
    DBGrid1: TDBGrid;
    DBNavigator1: TDBNavigator;
    queryBtn: TButton;
    quitBtn: TButton;
    Label1: TLabel;
    Label2: TLabel;
    procedure queryBtnClick(Sender: TObject);
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

procedure TForm1.queryBtnClick(Sender: TObject);
var
  tj, tj_gh, tj_xm, tj_xb, tj_csrq, tj_hf, tj_zc, tj_gz: string;
begin
  tj_gh := ' 1=1 '; // !!!!!!!!!!!  工号
  if CheckBox1.Checked and (Edit1.Text <> '') then
    tj_gh := ' gh like ' + QuotedStr('%' + edit1.Text + '%');

  tj_xm := ' 1=1'; // 姓名
  if CheckBox2.Checked and (Edit2.Text <> '') then
    tj_xm := 'xm like ' + QuotedStr('%' + edit2.Text + '%');

  tj_xb := ' 1=1'; // 性别
  if CheckBox3.Checked then
  begin
    case RadioGroup1.ItemIndex of
      0: tj_xb := 'xb like ' + QuotedStr('%' + RadioGroup1.Items[0] + '%');
      1: tj_xb := 'xb like ' + QuotedStr('%' + RadioGroup1.Items[1] + '%');
    end;
  end;

  tj_csrq := ' 1=1 '; // 出生日期  使用char类型即可比较
  if CheckBox4.Checked then
  begin
    //    tj_csrq := ' cast(csrq as varchar(20)) >=' +
    //      QuotedStr(FormatDateTime('yyyy-mm-dd', DateTimePicker1.Date)) +
    //      ' and cast(csrq as varchar(20)) <=' +
    //      QuotedStr(FormatDateTime('yyyy-mm-dd', DateTimePicker2.Date));
  end;

  tj_hf := ' 1=1 '; // 婚否
  if CheckBox5.Checked then
  begin
    if CheckBox8.Checked then
    begin
      tj_hf := ' hf=true ';
    end
    else
      tj_hf := ' hf=false ';
  end;

  tj_zc := ' 1=1 '; // 职称
  if CheckBox6.Checked then
    tj_zc := ' zc like ' + QuotedStr(ComboBox1.Text);

  tj_gz := ' 1=1 '; // 工资
  if CheckBox7.Checked and ((Edit3.Text <> '') or (Edit4.Text <> '')) then
  begin
    if Edit3.Text = '' then
    begin
      tj_gz := ' gz <=' + Edit4.Text;
    end
    else if Edit4.Text = '' then
    begin
      tj_gz := 'gz >=' + Edit3.Text;
    end
    else
      tj_gz := ' gz >=' + Edit3.Text + ' and ' + ' gz <=' + Edit4.Text;
  end;

  tj := 'select * from gz.db where ' + // !!!!
  tj_gh + ' and ' + tj_xm + ' and ' +
    tj_xb + ' and ' + tj_csrq + ' and ' +
    tj_hf + ' and ' + tj_zc + ' and ' + tj_gz;

  Query1.Close;
  Query1.SQL.Clear;
  Query1.SQL.Add(tj);
  Query1.Open;

end;

procedure TForm1.quitBtnClick(Sender: TObject);
begin
  Close;
end;

end.

