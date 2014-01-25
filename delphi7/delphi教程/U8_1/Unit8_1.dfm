object Form1: TForm1
  Left = 505
  Top = 185
  Width = 764
  Height = 405
  Caption = #25968#25454#24211#24212#29992
  Color = clBtnFace
  Font.Charset = ANSI_CHARSET
  Font.Color = clWindowText
  Font.Height = -14
  Font.Name = #23435#20307
  Font.Style = []
  OldCreateOrder = False
  PixelsPerInch = 96
  TextHeight = 14
  object DBImage1: TDBImage
    Left = 0
    Top = 0
    Width = 352
    Height = 168
    DataField = 'Graphic'
    DataSource = DataSource1
    TabOrder = 0
  end
  object DBMemo1: TDBMemo
    Left = 351
    Top = -1
    Width = 400
    Height = 168
    DataField = 'Notes'
    DataSource = DataSource1
    TabOrder = 1
  end
  object DBGrid1: TDBGrid
    Left = 0
    Top = 168
    Width = 752
    Height = 120
    DataSource = DataSource1
    TabOrder = 2
    TitleFont.Charset = ANSI_CHARSET
    TitleFont.Color = clWindowText
    TitleFont.Height = -14
    TitleFont.Name = #23435#20307
    TitleFont.Style = []
  end
  object DBNavigator1: TDBNavigator
    Left = 29
    Top = 294
    Width = 240
    Height = 25
    DataSource = DataSource1
    TabOrder = 3
  end
  object DataSource1: TDataSource
    DataSet = Table1
    Left = 386
    Top = 312
  end
  object Table1: TTable
    Active = True
    DatabaseName = 'DBDEMOS'
    TableName = 'biolife.db'
    Left = 436
    Top = 313
  end
end
