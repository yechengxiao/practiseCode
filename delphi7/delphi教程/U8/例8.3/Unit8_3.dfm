object Form1: TForm1
  Left = 575
  Top = 175
  Width = 684
  Height = 606
  Caption = #25968#25454#24211#32534#31243
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
    Left = 38
    Top = 21
    Width = 582
    Height = 436
    Caption = 'GroupBox1'
    TabOrder = 0
    object Label1: TLabel
      Left = 25
      Top = 29
      Width = 28
      Height = 14
      Caption = #24037#21495
    end
    object Label2: TLabel
      Left = 32
      Top = 61
      Width = 28
      Height = 14
      Caption = #22995#21517
    end
    object Label3: TLabel
      Left = 8
      Top = 81
      Width = 56
      Height = 14
      Caption = #20986#29983#24180#26376
    end
    object Label4: TLabel
      Left = 30
      Top = 141
      Width = 28
      Height = 14
      Caption = #32844#31216
    end
    object Label5: TLabel
      Left = 34
      Top = 106
      Width = 28
      Height = 14
      Caption = #24037#36164
    end
    object Label6: TLabel
      Left = 28
      Top = 209
      Width = 28
      Height = 14
      Caption = #31616#21382
    end
    object DBEdit1: TDBEdit
      Left = 79
      Top = 23
      Width = 120
      Height = 22
      DataField = 'Gh'
      DataSource = DataSource1
      TabOrder = 0
    end
    object DBEdit2: TDBEdit
      Left = 79
      Top = 51
      Width = 120
      Height = 22
      DataField = 'Xm'
      DataSource = DataSource1
      TabOrder = 1
    end
    object DBEdit3: TDBEdit
      Left = 79
      Top = 79
      Width = 120
      Height = 22
      DataField = 'Csrq'
      DataSource = DataSource1
      TabOrder = 2
    end
    object DBEdit4: TDBEdit
      Left = 79
      Top = 108
      Width = 120
      Height = 22
      DataField = 'Gz'
      DataSource = DataSource1
      TabOrder = 3
    end
    object DBRadioGroup1: TDBRadioGroup
      Left = 207
      Top = 20
      Width = 101
      Height = 72
      Caption = #24615#21035
      Columns = 2
      DataField = 'Xb'
      DataSource = DataSource1
      Items.Strings = (
        #30007
        #22899)
      TabOrder = 4
    end
    object DBComboBox1: TDBComboBox
      Left = 79
      Top = 136
      Width = 120
      Height = 22
      DataField = 'Zc'
      DataSource = DataSource1
      ItemHeight = 14
      Items.Strings = (
        #39640#32423#24037#31243
        #24072' '#24037' '#31243
        #24072' '#21161' '#29702
        #24037' '#31243' '#24072
        #25216#26415#21592
        #24037#20154)
      TabOrder = 5
    end
    object DBCheckBox1: TDBCheckBox
      Left = 218
      Top = 141
      Width = 97
      Height = 17
      Caption = #24050#23130
      DataField = 'Hf'
      DataSource = DataSource1
      TabOrder = 6
      ValueChecked = 'True'
      ValueUnchecked = 'False'
    end
    object DBMemo1: TDBMemo
      Left = 78
      Top = 181
      Width = 434
      Height = 89
      DataField = 'Jl'
      DataSource = DataSource1
      TabOrder = 7
    end
    object DBImage1: TDBImage
      Left = 334
      Top = 15
      Width = 105
      Height = 140
      DataField = 'Zp'
      DataSource = DataSource1
      TabOrder = 8
    end
    object DBGrid1: TDBGrid
      Left = 77
      Top = 293
      Width = 433
      Height = 120
      DataSource = DataSource1
      TabOrder = 9
      TitleFont.Charset = ANSI_CHARSET
      TitleFont.Color = clWindowText
      TitleFont.Height = -14
      TitleFont.Name = #23435#20307
      TitleFont.Style = []
    end
  end
  object DBNavigator1: TDBNavigator
    Left = 36
    Top = 475
    Width = 224
    Height = 25
    DataSource = DataSource1
    VisibleButtons = [nbFirst, nbPrior, nbNext, nbLast]
    TabOrder = 1
  end
  object saveBtn: TButton
    Left = 399
    Top = 503
    Width = 70
    Height = 25
    Caption = #20445#23384#65288'&S'#65289
    TabOrder = 2
    OnClick = saveBtnClick
  end
  object queryBtn: TButton
    Left = 326
    Top = 503
    Width = 70
    Height = 25
    Caption = #26597#35810#65288'&Q'#65289
    TabOrder = 3
    OnClick = queryBtnClick
  end
  object quitBtn: TButton
    Left = 545
    Top = 503
    Width = 70
    Height = 25
    Caption = #36864#20986#65288'&E'#65289
    TabOrder = 4
    OnClick = quitBtnClick
  end
  object cancelBtn: TButton
    Left = 471
    Top = 503
    Width = 70
    Height = 25
    Caption = #21462#28040#65288'&C'#65289
    TabOrder = 5
    OnClick = cancelBtnClick
  end
  object delBtn: TButton
    Left = 107
    Top = 503
    Width = 70
    Height = 25
    Caption = #21024#38500#65288'&D'#65289
    TabOrder = 6
    OnClick = delBtnClick
  end
  object addBtn: TButton
    Left = 33
    Top = 503
    Width = 70
    Height = 25
    Caption = #26032#22686#65288'&A'#65289
    TabOrder = 7
    OnClick = addBtnClick
  end
  object locateBtn: TButton
    Left = 253
    Top = 503
    Width = 70
    Height = 25
    Caption = #23450#20301#65288'&L'#65289
    TabOrder = 8
    OnClick = locateBtnClick
  end
  object updateBtn: TButton
    Left = 180
    Top = 503
    Width = 70
    Height = 25
    Caption = #20462#25913#65288'&U'#65289
    TabOrder = 9
    OnClick = updateBtnClick
  end
  object StatusBar1: TStatusBar
    Left = 0
    Top = 549
    Width = 668
    Height = 19
    Panels = <
      item
        Width = 50
      end>
  end
  object Table1: TTable
    Active = True
    DatabaseName = 'EX8'
    TableName = 'GZ.db'
    Left = 623
    Top = 35
  end
  object DataSource1: TDataSource
    DataSet = Table1
    OnDataChange = DataSource1DataChange
    Left = 624
    Top = 72
  end
end
