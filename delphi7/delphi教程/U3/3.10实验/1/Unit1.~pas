unit Unit1;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, StdCtrls, ExtCtrls;

type
  TForm1 = class(TForm)
    RadioGroup1: TRadioGroup;
    GroupBox1: TGroupBox;
    CheckBox1: TCheckBox;
    commit: TButton;
    cancel: TButton;
    Memo1: TMemo;
    CheckBox2: TCheckBox;
    CheckBox3: TCheckBox;
    procedure commitClick(Sender: TObject);
    procedure cancelClick(Sender: TObject);
    procedure FormClose(Sender: TObject; var Action: TCloseAction);
    procedure add_captionOfCheckbox(cbox: TCheckBox; text: TMemo);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  Form1: TForm1;

implementation

{$R *.dfm}

procedure TForm1.add_captionOfCheckbox(cbox: TCheckBox; text: TMemo);
begin
  if cbox.Checked then
    text.Text := text.Text + '、' + cbox.Caption;
end;

procedure TForm1.commitClick(Sender: TObject);
var
  choice: string;
begin
  if RadioGroup1.ItemIndex <> -1 then
  begin
    case RadioGroup1.ItemIndex of
      0: choice := RadioGroup1.items.Strings[0]; //0: choice := '龙虾';
      1: choice := RadioGroup1.items.Strings[1];
      2: choice := RadioGroup1.items.Strings[2];
    end;
    Memo1.Text := '你的选择为：' + choice;

    add_captionOfCheckbox(CheckBox1, Memo1);
    add_captionOfCheckbox(CheckBox2, Memo1);
    add_captionOfCheckbox(CheckBox3, Memo1);
  end
  else
  begin
    Memo1.Text := '没有选择任何海鲜';
  end;
end;

procedure TForm1.cancelClick(Sender: TObject);
begin
  Close;
end;

procedure TForm1.FormClose(Sender: TObject; var Action: TCloseAction);
begin
  Action := caFree;
end;

end.

