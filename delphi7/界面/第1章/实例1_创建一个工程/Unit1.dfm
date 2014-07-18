object Form1: TForm1
  Left = 391
  Top = 229
  Width = 760
  Height = 364
  Caption = 'Delphi 4'
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'MS Sans Serif'
  Font.Style = []
  Menu = MainMenu1
  OldCreateOrder = False
  PixelsPerInch = 96
  TextHeight = 13
  object StatusBar1: TStatusBar
    Left = 0
    Top = 287
    Width = 744
    Height = 19
    Panels = <>
  end
  object ToolBar1: TToolBar
    Left = 0
    Top = 0
    Width = 744
    Height = 26
    AutoSize = True
    Caption = 'ToolBar1'
    EdgeBorders = [ebTop, ebBottom]
    Flat = True
    TabOrder = 1
    object ToolButton1: TToolButton
      Left = 0
      Top = 0
      ImageIndex = 0
    end
    object ToolButton2: TToolButton
      Left = 23
      Top = 0
      ImageIndex = 1
    end
    object ToolButton3: TToolButton
      Left = 46
      Top = 0
      ImageIndex = 2
    end
  end
  object Memo1: TMemo
    Left = 0
    Top = 26
    Width = 744
    Height = 261
    Align = alClient
    Lines.Strings = (
      #29366#24577#26639
      #33756#21333
      #24037#20855#26639)
    TabOrder = 2
  end
  object MainMenu1: TMainMenu
    Left = 396
    Top = 195
    object N1: TMenuItem
      Caption = #25991#20214'(&F)'
      object N2: TMenuItem
        Caption = #25171#24320'(&O)'
        ShortCut = 16463
      end
      object N3: TMenuItem
        Caption = #20445#23384'(&S)'
        ShortCut = 16467
      end
      object N4: TMenuItem
        Caption = #21478#23384#20026
      end
      object N5: TMenuItem
        Caption = '-'
      end
      object N6: TMenuItem
        Caption = #20851#38381'(&X)'
        ShortCut = 16472
      end
    end
  end
end
