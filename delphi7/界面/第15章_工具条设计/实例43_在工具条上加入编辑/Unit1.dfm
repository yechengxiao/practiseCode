object Form1: TForm1
  Left = 439
  Top = 253
  Width = 650
  Height = 284
  Caption = 'Form1'
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'MS Sans Serif'
  Font.Style = []
  OldCreateOrder = False
  PixelsPerInch = 96
  TextHeight = 13
  object ctrlbr1: TControlBar
    Left = 0
    Top = 0
    Width = 634
    Height = 30
    Align = alTop
    Anchors = [akLeft, akTop, akRight, akBottom]
    AutoSize = True
    BevelEdges = [beTop, beBottom]
    TabOrder = 0
    object tlb1: TToolBar
      Left = 78
      Top = 2
      Width = 374
      Height = 22
      AutoSize = True
      Caption = 'tlb1'
      EdgeBorders = []
      Flat = True
      TabOrder = 0
      object btn1: TToolButton
        Left = 0
        Top = 0
        Caption = 'btn1'
        ImageIndex = 0
      end
      object btn2: TToolButton
        Left = 23
        Top = 0
        Caption = 'btn2'
        ImageIndex = 1
      end
      object btn3: TToolButton
        Left = 46
        Top = 0
        Caption = 'btn3'
        ImageIndex = 2
      end
      object btn4: TToolButton
        Left = 69
        Top = 0
        Width = 8
        Caption = 'btn4'
        ImageIndex = 3
        Style = tbsSeparator
      end
      object Edit1: TEdit
        Left = 77
        Top = 0
        Width = 121
        Height = 22
        TabOrder = 0
      end
      object btn5: TToolButton
        Left = 198
        Top = 0
        Width = 8
        Caption = 'btn5'
        ImageIndex = 4
        Style = tbsSeparator
      end
    end
  end
end
