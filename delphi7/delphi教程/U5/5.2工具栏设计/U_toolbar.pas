unit U_toolbar;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, Menus, ImgList, StdCtrls, ComCtrls, Buttons, ExtCtrls;

type
  TForm1 = class(TForm)
    MainMenu1: TMainMenu;
    Files: TMenuItem;
    New: TMenuItem;
    Open: TMenuItem;
    Save: TMenuItem;
    Exit: TMenuItem;
    Edit: TMenuItem;
    Cut: TMenuItem;
    Copy: TMenuItem;
    Paste: TMenuItem;
    Formats: TMenuItem;
    Font: TMenuItem;
    Color: TMenuItem;
    Help: TMenuItem;
    About: TMenuItem;
    OpenDialog1: TOpenDialog;
    SaveDialog1: TSaveDialog;
    FontDialog1: TFontDialog;
    ColorDialog1: TColorDialog;
    ImageList1: TImageList;
    Panel1: TPanel;
    RichEdit1: TRichEdit;
    FontCmb: TComboBox;
    FontSizeCmb: TComboBox;
    newSpBtn: TSpeedButton;
    OpenSpBtn: TSpeedButton;
    SaveSpBtn: TSpeedButton;
    CutSpBtn: TSpeedButton;
    CopySpBtn: TSpeedButton;
    PasteSpBtn: TSpeedButton;
    procedure ExitClick(Sender: TObject);
    procedure SaveClick(Sender: TObject);
    procedure OpenClick(Sender: TObject);
    procedure NewClick(Sender: TObject);
    procedure CutClick(Sender: TObject);
    procedure CopyClick(Sender: TObject);
    procedure PasteClick(Sender: TObject);
    procedure FontClick(Sender: TObject);
    procedure ColorClick(Sender: TObject);
    procedure FontSizeCmbChange(Sender: TObject);
    procedure FontCmbChange(Sender: TObject);
    procedure AboutClick(Sender: TObject);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  Form1: TForm1;

implementation

{$R *.dfm}

procedure TForm1.ExitClick(Sender: TObject);
begin
  close;
end;

procedure TForm1.SaveClick(Sender: TObject);
begin
  with SaveDialog1 do
  begin
    Filter :=
      '�ı��ļ�(*.txt)|*.txt|Word�ĵ�(*.doc)|*.doc|�����ļ�(*.*)|*.*';
    DefaultExt := 'txt';
    if Execute then
      RichEdit1.Lines.SaveToFile(FileName);
  end;
end;

procedure TForm1.OpenClick(Sender: TObject);
begin
  with OpenDialog1 do
  begin
    Filter := '�ı��ļ�(*.txt)|*.txt|Word�ĵ�(*.doc)|*.doc|�����ļ�(*.*)|*.*';
    // ����
    DefaultExt := 'txt';
    Options := [ofHideReadOnly, OfFileMustExist, ofPathMustExist];
    if Execute then
      RichEdit1.Lines.LoadFromFile(FileName);
  end;
end;

procedure TForm1.NewClick(Sender: TObject); // �½�
begin
  RichEdit1.Clear;
end;

procedure TForm1.CutClick(Sender: TObject); // ����
begin
  if RichEdit1.SelLength > 0 then
    RichEdit1.CutToClipboard;
end;

procedure TForm1.CopyClick(Sender: TObject); // ����
begin
  if RichEdit1.SelLength > 0 then
    RichEdit1.CopyToClipboard;
end;

procedure TForm1.PasteClick(Sender: TObject); // ճ��
begin
  RichEdit1.PasteFromClipboard;
end;

procedure TForm1.FontClick(Sender: TObject); // ����
begin
  if RichEdit1.SelLength > 0 then
  begin
    FontDialog1.Font.Assign(RichEdit1.DefAttributes); // ָ��
    if FontDialog1.Execute then
      RichEdit1.SelAttributes.Assign(FontDialog1.Font); // ��ѡ�ַ���������
  end;
end;

procedure TForm1.ColorClick(Sender: TObject); //  ��ɫ
begin
  ColorDialog1.Color := RichEdit1.Color;
  if ColorDialog1.Execute then
    //RichEdit1.Color := ColorDialog1.Color; //  RichEdit1�ı���
    RichEdit1.selAttributes.color := ColorDialog1.Color; // ��ѡ�ַ�������ɫ
end;

procedure TForm1.FontSizeCmbChange(Sender: TObject); // �ֺ�
begin
  if RichEdit1.SelLength > 0 then
    RichEdit1.SelAttributes.size := StrToInt(FontSizeCmb.Text);
  // ��ѡ�ַ������ֺ�
end;

procedure TForm1.FontCmbChange(Sender: TObject); // ����
begin
  if RichEdit1.SelLength > 0 then
    RichEdit1.SelAttributes.name := FontCmb.Text; // ��ѡ�ַ���������
end;

procedure TForm1.AboutClick(Sender: TObject); // ����
begin
  MessageDlg('��ӭʹ��', mtInformation, [mbOK], 0);
end;

end.

