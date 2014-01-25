object Form1: TForm1
  Left = 672
  Top = 242
  Width = 319
  Height = 300
  Caption = #36873#25321
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'MS Sans Serif'
  Font.Style = []
  OldCreateOrder = False
  OnClose = FormClose
  PixelsPerInch = 96
  TextHeight = 13
  object RadioGroup1: TRadioGroup
    Left = 0
    Top = 40
    Width = 150
    Height = 183
    Caption = #28023#40092
    Items.Strings = (
      #40857#34430
      #38738#34809
      #40077#40060)
    TabOrder = 0
  end
  object GroupBox1: TGroupBox
    Left = 152
    Top = 40
    Width = 150
    Height = 183
    Caption = #37197#26009
    TabOrder = 1
    object CheckBox1: TCheckBox
      Left = 9
      Top = 35
      Width = 97
      Height = 17
      Caption = #37233#27833
      TabOrder = 0
    end
    object CheckBox2: TCheckBox
      Left = 9
      Top = 93
      Width = 97
      Height = 17
      Caption = #33445#26411
      TabOrder = 1
    end
    object CheckBox3: TCheckBox
      Left = 9
      Top = 150
      Width = 97
      Height = 17
      Caption = #37259
      TabOrder = 2
    end
  end
  object commit: TButton
    Left = 184
    Top = 232
    Width = 75
    Height = 25
    Caption = #25552#20132
    TabOrder = 2
    OnClick = commitClick
  end
  object cancel: TButton
    Left = 32
    Top = 232
    Width = 75
    Height = 25
    Caption = #20851#38381
    TabOrder = 3
    OnClick = cancelClick
  end
  object Memo1: TMemo
    Left = 0
    Top = 0
    Width = 302
    Height = 39
    TabOrder = 4
  end
end
