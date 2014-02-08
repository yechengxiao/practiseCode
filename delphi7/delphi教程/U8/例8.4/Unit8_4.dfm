object Form1: TForm1
  Left = 529
  Top = 101
  Width = 632
  Height = 501
  Caption = #25968#25454#24211#26597#35810
  Color = clBtnFace
  Font.Charset = ANSI_CHARSET
  Font.Color = clWindowText
  Font.Height = -14
  Font.Name = #23435#20307
  Font.Style = []
  OldCreateOrder = False
  PixelsPerInch = 96
  TextHeight = 14
  object GroupBox1: TGroupBox
    Left = 33
    Top = 56
    Width = 372
    Height = 248
    Caption = #26816#32034#26465#20214
    TabOrder = 0
    object Label1: TLabel
      Left = 183
      Top = 118
      Width = 7
      Height = 14
      Caption = '~'
    end
    object Label2: TLabel
      Left = 196
      Top = 179
      Width = 7
      Height = 14
      Caption = '~'
    end
    object CheckBox1: TCheckBox
      Left = 1
      Top = 26
      Width = 50
      Height = 17
      Caption = #24037#21495
      TabOrder = 0
    end
    object CheckBox2: TCheckBox
      Left = 2
      Top = 59
      Width = 50
      Height = 17
      Caption = #22995#21517
      TabOrder = 1
    end
    object CheckBox3: TCheckBox
      Left = 0
      Top = 86
      Width = 50
      Height = 17
      Caption = #24615#21035
      TabOrder = 2
    end
    object CheckBox4: TCheckBox
      Left = 3
      Top = 114
      Width = 50
      Height = 17
      Caption = #29983#26085
      TabOrder = 3
    end
    object CheckBox5: TCheckBox
      Left = 6
      Top = 217
      Width = 50
      Height = 17
      Caption = #23130#21542
      TabOrder = 4
    end
    object CheckBox6: TCheckBox
      Left = -2
      Top = 139
      Width = 50
      Height = 17
      Caption = #32844#31216
      TabOrder = 5
    end
    object CheckBox7: TCheckBox
      Left = 3
      Top = 176
      Width = 50
      Height = 17
      Caption = #24037#36164
      TabOrder = 6
    end
    object CheckBox8: TCheckBox
      Left = 64
      Top = 215
      Width = 50
      Height = 17
      Caption = #24050#23130
      TabOrder = 7
    end
    object Edit1: TEdit
      Left = 64
      Top = 23
      Width = 121
      Height = 22
      TabOrder = 8
    end
    object Edit2: TEdit
      Left = 64
      Top = 52
      Width = 121
      Height = 22
      TabOrder = 9
    end
    object Edit3: TEdit
      Left = 70
      Top = 175
      Width = 121
      Height = 22
      TabOrder = 10
    end
    object Edit4: TEdit
      Left = 210
      Top = 172
      Width = 121
      Height = 22
      TabOrder = 11
    end
    object RadioGroup1: TRadioGroup
      Left = 60
      Top = 76
      Width = 121
      Height = 30
      Columns = 2
      Font.Charset = ANSI_CHARSET
      Font.Color = clWindowText
      Font.Height = -12
      Font.Name = #23435#20307
      Font.Style = []
      ItemIndex = 0
      Items.Strings = (
        #30007
        #22899)
      ParentFont = False
      TabOrder = 12
    end
    object ComboBox1: TComboBox
      Left = 68
      Top = 146
      Width = 145
      Height = 22
      Style = csDropDownList
      ItemHeight = 14
      ItemIndex = 0
      TabOrder = 13
      Text = #24037#31243#24072
      Items.Strings = (
        #24037#31243#24072
        #39640#32423#24037#31243#24072' '
        #21161' '#29702#24037' '#24072
        #25216#26415#21592#24037#20154)
    end
    object DateTimePicker1: TDateTimePicker
      Left = 82
      Top = 109
      Width = 95
      Height = 22
      Date = 41678.352407511570000000
      Time = 41678.352407511570000000
      TabOrder = 14
    end
    object DateTimePicker2: TDateTimePicker
      Left = 199
      Top = 108
      Width = 98
      Height = 22
      Date = 41678.352407511570000000
      Time = 41678.352407511570000000
      TabOrder = 15
    end
  end
  object DBMemo1: TDBMemo
    Left = 412
    Top = 298
    Width = 185
    Height = 110
    DataField = 'Jl'
    DataSource = DataSource1
    TabOrder = 1
  end
  object DBImage1: TDBImage
    Left = 412
    Top = 66
    Width = 142
    Height = 149
    DataField = 'Zp'
    DataSource = DataSource1
    TabOrder = 2
  end
  object DBGrid1: TDBGrid
    Left = 33
    Top = 304
    Width = 372
    Height = 120
    DataSource = DataSource1
    TabOrder = 3
    TitleFont.Charset = ANSI_CHARSET
    TitleFont.Color = clWindowText
    TitleFont.Height = -14
    TitleFont.Name = #23435#20307
    TitleFont.Style = []
  end
  object DBNavigator1: TDBNavigator
    Left = 36
    Top = 426
    Width = 120
    Height = 25
    DataSource = DataSource1
    VisibleButtons = [nbFirst, nbPrior, nbNext, nbLast]
    TabOrder = 4
  end
  object queryBtn: TButton
    Left = 160
    Top = 431
    Width = 75
    Height = 20
    Caption = #26597#35810'(&Q)'
    TabOrder = 5
    OnClick = queryBtnClick
  end
  object quitBtn: TButton
    Left = 238
    Top = 426
    Width = 75
    Height = 25
    Caption = #36864#20986'(&E)'
    TabOrder = 6
    OnClick = quitBtnClick
  end
  object Query1: TQuery
    Active = True
    DatabaseName = 'EX8'
    SQL.Strings = (
      'select * from GZ.db')
    Left = 46
    Top = 16
  end
  object DataSource1: TDataSource
    DataSet = Query1
    Left = 16
    Top = 17
  end
end
