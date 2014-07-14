object Form1: TForm1
  Left = 427
  Top = 201
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
    Height = 25
    AutoSize = True
    Bands = <
      item
        Control = tlb1
        ImageIndex = -1
        MinHeight = 21
        Width = 427
      end>
    EdgeBorders = [ebTop, ebBottom]
    object tlb1: TToolBar
      Left = 9
      Top = 0
      Width = 414
      Height = 21
      AutoSize = True
      ButtonHeight = 21
      ButtonWidth = 31
      Caption = 'tlb1'
      EdgeBorders = []
      Flat = True
      ShowCaptions = True
      TabOrder = 0
      object btn1: TToolButton
        Left = 0
        Top = 0
        Caption = #26174#31034
        ImageIndex = 0
        Style = tbsCheck
        OnClick = btn1Click
      end
    end
  end
  object Edit1: TEdit
    Left = 133
    Top = 109
    Width = 121
    Height = 22
    ParentShowHint = False
    PasswordChar = '*'
    ShowHint = True
    TabOrder = 1
  end
end
