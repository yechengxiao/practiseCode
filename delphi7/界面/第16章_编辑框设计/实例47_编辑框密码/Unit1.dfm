object Form1: TForm1
  Left = 510
  Top = 286
  Width = 443
  Height = 285
  Caption = #26174#31034#32534#36753#26694#23494#30721
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'MS Sans Serif'
  Font.Style = []
  OldCreateOrder = False
  PixelsPerInch = 96
  TextHeight = 13
  object clbr1: TCoolBar
    Left = 0
    Top = 0
    Width = 427
    Height = 28
    AutoSize = True
    Bands = <
      item
        Control = tlb1
        ImageIndex = -1
        MinHeight = 24
        Width = 427
      end>
    EdgeBorders = [ebTop, ebBottom]
    object tlb1: TToolBar
      Left = 9
      Top = 0
      Width = 414
      Height = 24
      AutoSize = True
      ButtonHeight = 24
      ButtonWidth = 39
      Caption = 'tlb1'
      EdgeBorders = []
      Flat = True
      Font.Charset = ANSI_CHARSET
      Font.Color = clWindowText
      Font.Height = -16
      Font.Name = #23435#20307
      Font.Style = []
      ParentFont = False
      ShowCaptions = True
      TabOrder = 0
      object btn1: TToolButton
        Left = 0
        Top = 0
        Caption = #26174#31034
        Grouped = True
        ImageIndex = 0
        Style = tbsCheck
        OnClick = btn1Click
      end
      object btn2: TToolButton
        Left = 39
        Top = 0
        Caption = #38544#34255
        Grouped = True
        ImageIndex = 1
        Style = tbsCheck
        OnClick = btn2Click
      end
      object btn3: TToolButton
        Left = 78
        Top = 0
        Width = 8
        Caption = 'btn3'
        ImageIndex = 2
        Style = tbsSeparator
      end
    end
  end
  object Edit1: TEdit
    Left = 133
    Top = 109
    Width = 121
    Height = 21
    ParentShowHint = False
    PasswordChar = '*'
    ShowHint = True
    TabOrder = 1
  end
end
