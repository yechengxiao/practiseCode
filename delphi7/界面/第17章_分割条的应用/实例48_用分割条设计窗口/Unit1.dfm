object Form1: TForm1
  Left = 396
  Top = 273
  Width = 611
  Height = 288
  Caption = #20998#38548#26465#30340#24212#29992
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'MS Sans Serif'
  Font.Style = []
  OldCreateOrder = False
  PixelsPerInch = 96
  TextHeight = 13
  object Splitter1: TSplitter
    Left = 206
    Top = 0
    Width = 4
    Height = 250
  end
  object pnl1: TPanel
    Left = 0
    Top = 0
    Width = 206
    Height = 250
    Align = alLeft
    TabOrder = 0
    object tv1: TTreeView
      Left = 1
      Top = 1
      Width = 204
      Height = 248
      Align = alClient
      Indent = 19
      TabOrder = 0
      OnChange = tv1Change
      Items.Data = {
        030000001B0000000000000000000000FFFFFFFFFFFFFFFF0000000001000000
        0231311B0000000000000000000000FFFFFFFFFFFFFFFF000000000100000002
        31321B0000000000000000000000FFFFFFFFFFFFFFFF00000000010000000231
        331B0000000000000000000000FFFFFFFFFFFFFFFF0000000000000000023134
        1B0000000000000000000000FFFFFFFFFFFFFFFF00000000010000000232311B
        0000000000000000000000FFFFFFFFFFFFFFFF00000000010000000232321B00
        00000000000000000000FFFFFFFFFFFFFFFF00000000010000000232331B0000
        000000000000000000FFFFFFFFFFFFFFFF00000000000000000232341B000000
        0000000000000000FFFFFFFFFFFFFFFF00000000010000000233311B00000000
        00000000000000FFFFFFFFFFFFFFFF00000000010000000233321B0000000000
        000000000000FFFFFFFFFFFFFFFF00000000010000000233331B000000000000
        0000000000FFFFFFFFFFFFFFFF0000000000000000023334}
    end
  end
  object pnl2: TPanel
    Left = 210
    Top = 0
    Width = 385
    Height = 250
    Align = alClient
    TabOrder = 1
    object mmo1: TMemo
      Left = 1
      Top = 1
      Width = 383
      Height = 248
      Align = alClient
      Font.Charset = ANSI_CHARSET
      Font.Color = clBlack
      Font.Height = -24
      Font.Name = #23435#20307
      Font.Style = [fsBold]
      Lines.Strings = (
        '')
      ParentFont = False
      TabOrder = 0
    end
  end
end
