object Form1: TForm1
  Left = 445
  Top = 302
  Width = 361
  Height = 226
  Caption = #29366#24577#26639#26174#31034#36827#24230#26465
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'MS Sans Serif'
  Font.Style = []
  OldCreateOrder = False
  OnClose = FormClose
  OnShow = FormShow
  PixelsPerInch = 96
  TextHeight = 13
  object lbl1: TLabel
    Left = 192
    Top = 83
    Width = 28
    Height = 13
    Caption = #27627#31186
    Font.Charset = ANSI_CHARSET
    Font.Color = clWindowText
    Font.Height = -13
    Font.Name = #23435#20307
    Font.Style = [fsBold]
    ParentFont = False
    WordWrap = True
  end
  object StatusBar1: TStatusBar
    Left = 0
    Top = 169
    Width = 345
    Height = 19
    Panels = <
      item
        Text = '  '#34892'  '#21015
        Width = 50
      end
      item
        Style = psOwnerDraw
        Width = 50
      end>
    OnDrawPanel = StatusBar1DrawPanel
  end
  object medt1: TMaskEdit
    Left = 138
    Top = 81
    Width = 49
    Height = 21
    EditMask = '!99999;1;_'
    MaxLength = 5
    TabOrder = 1
    Text = '     '
  end
  object btn1: TButton
    Left = 138
    Top = 113
    Width = 75
    Height = 25
    Caption = #24320#22987
    Default = True
    TabOrder = 2
    OnClick = btn1Click
  end
  object tmr1: TTimer
    OnTimer = tmr1Timer
    Left = 89
    Top = 80
  end
end
