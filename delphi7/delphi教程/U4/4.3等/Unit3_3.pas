unit Unit3_3;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, StdCtrls, ExtCtrls, Menus;

type
  TForm1 = class(TForm)
    GroupBox1: TGroupBox;
    RadioGroup1: TRadioGroup;
    ColorDialog1: TColorDialog;
    FontDialog1: TFontDialog;
    Memo1: TMemo;
    Button1: TButton;
    Button2: TButton;
    Button3: TButton;
    MainMenu1: TMainMenu;
    Option: TMenuItem;
    OptionColor: TMenuItem;
    OptionFont: TMenuItem;
    OptionAlign: TMenuItem;
    OptionAlignLeft: TMenuItem;
    OptionAlignRight: TMenuItem;
    OptionAlignCenter: TMenuItem;
    OptionHide: TMenuItem;
    Help: TMenuItem;
    N3: TMenuItem;
    N1: TMenuItem;
    PopupMenu1: TPopupMenu;
    popup_color: TMenuItem;
    popup_font: TMenuItem;
    popup_align: TMenuItem;
    popup_hide: TMenuItem;
    popup_align_left: TMenuItem;
    popup_align_center: TMenuItem;
    popup_align_right: TMenuItem;
    N8: TMenuItem;
    procedure Button1Click(Sender: TObject);
    procedure Button2Click(Sender: TObject);
    procedure Button3Click(Sender: TObject);
    procedure RadioGroup1Click(Sender: TObject);
    procedure OptionAlignLeftClick(Sender: TObject);
    procedure OptionAlignCenterClick(Sender: TObject);
    procedure OptionAlignRightClick(Sender: TObject);
    procedure HelpClick(Sender: TObject);
    procedure OptionHideClick(Sender: TObject);
    procedure popup_align_leftClick(Sender: TObject);
    procedure popup_align_centerClick(Sender: TObject);
    procedure popup_align_rightClick(Sender: TObject);

  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  Form1: TForm1;

implementation

{$R *.dfm}

procedure TForm1.Button1Click(Sender: TObject); //������ɫ
begin
  with ColorDialog1 do // Ϊ�˼���������ַ�,����ÿ���ظ�����,ֱ��д����
  begin
    color := Memo1.Color;
    if Execute then
    begin
      Memo1.Color := Color;
    end;
  end;
end;

procedure TForm1.Button2Click(Sender: TObject); //��������
begin
  with FontDialog1 do
  begin
    font := Memo1.Font;
    if Execute then
    begin
      Memo1.Font := Font;
    end;
  end;
end;

procedure TForm1.Button3Click(Sender: TObject); //��������
begin
  Memo1.Lines.text := ' ������Ҫ˯��' + chr(13) + chr(13) + //chr(13 )Ϊ�س���
  '�����ޣ�' + chr(13) + ' Ҫ˯����' + chr(13) +
    'С�ޱ���' + chr(13) + ' �ǸǺã�' + chr(13) +
    '�����Ѿ' + chr(13) + ' �˷�����' + chr(13) +
    '����һ����' + chr(13) + ' ����С��è��';
end;

procedure TForm1.RadioGroup1Click(Sender: TObject); //��������
begin
  case RadioGroup1.ItemIndex of
    0: Memo1.Alignment := taLeftJustify;
    1: Memo1.Alignment := taCenter;
    2: Memo1.Alignment := taRightJustify;
  end;
end;

procedure TForm1.OptionAlignLeftClick(Sender: TObject);
begin
  Memo1.Alignment := taLeftJustify;
  OptionAlignLeft.Checked := True; // ��ѡ��״̬������һ����
  OptionAlignCenter.Checked := False;
  OptionAlignRight.Checked := False;
  RadioGroup1.ItemIndex := 0; // radiogroup ѡ��

end;

procedure TForm1.OptionAlignCenterClick(Sender: TObject);
begin
  Memo1.Alignment := taCenter;
  OptionAlignLeft.Checked := False; // ��ѡ��״̬������һ����
  OptionAlignCenter.Checked := True;
  OptionAlignRight.Checked := False;
  RadioGroup1.ItemIndex := 1; // radiogroup ѡ��
end;

procedure TForm1.OptionAlignRightClick(Sender: TObject);
begin
  Memo1.Alignment := taRightJustify;
  OptionAlignLeft.Checked := False; // ��ѡ��״̬������һ����
  OptionAlignCenter.Checked := False;
  OptionAlignRight.Checked := True;
  RadioGroup1.ItemIndex := 2; // radiogroup ѡ��
end;

procedure TForm1.HelpClick(Sender: TObject);
begin
  // Help.Enabled := not Help.Enabled; // ʧЧ
  Help.Visible := not Help.Visible; // ����
  if Help.visible then
  begin
    optionHide.caption := '����';
  end
  else
  begin
    optionHide.caption := '��ʾ';
  end;

end;

procedure TForm1.OptionHideClick(Sender: TObject);
begin
  if Help.Visible then
  begin
    Help.visible := false;
    optionHide.caption := '��ʾ';
  end
  else
  begin
    Help.visible := true;
    optionHide.caption := '����';
  end;
end;

procedure TForm1.popup_align_leftClick(Sender: TObject);
begin
  Memo1.Alignment := taLeftJustify;
  popup_align_left.checked := True; // ��ѡ��״̬������һ����
  popup_align_center.checked := False;
  popup_align_right.checked := False;
  RadioGroup1.ItemIndex := 0; // radiogroup ѡ��
end;

procedure TForm1.popup_align_centerClick(Sender: TObject);
begin
  Memo1.Alignment := taCenter;
  popup_align_left.checked := False; // ��ѡ��״̬������һ����
  popup_align_center.checked := True;
  popup_align_right.checked := False;
  RadioGroup1.ItemIndex := 1; // radiogroup ѡ��
end;

procedure TForm1.popup_align_rightClick(Sender: TObject);
begin
  Memo1.Alignment := taRightJustify;
  popup_align_left.checked := False; // ��ѡ��״̬������һ����
  popup_align_center.checked := False;
  popup_align_right.checked := True;
  RadioGroup1.ItemIndex := 2; // radiogroup ѡ��
end;
end.

