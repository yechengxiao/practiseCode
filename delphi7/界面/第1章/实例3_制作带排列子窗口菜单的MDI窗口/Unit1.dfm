object Form1: TForm1
  Left = 352
  Top = 301
  Width = 663
  Height = 184
  Caption = 'Form1'
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'MS Sans Serif'
  Font.Style = []
  FormStyle = fsMDIForm
  Menu = MainMenu1
  OldCreateOrder = False
  PixelsPerInch = 96
  TextHeight = 13
  object ActionList1: TActionList
    Left = 330
    Top = 23
    object WindowTileHorizontal1: TWindowTileHorizontal
      Category = 'Window'
      Caption = 'Tile &Horizontally'
      Enabled = False
      Hint = 'Tile Horizontal'
      ImageIndex = 15
      OnExecute = WindowTileHorizontal1Execute
    end
    object WindowTileVertical1: TWindowTileVertical
      Category = 'Window'
      Caption = '&Tile Vertically'
      Enabled = False
      Hint = 'Tile Vertical'
      ImageIndex = 16
      OnExecute = WindowTileVertical1Execute
    end
  end
  object MainMenu1: TMainMenu
    Left = 290
    Top = 23
    object File1: TMenuItem
      Caption = 'File'
      OnClick = File1Click
    end
    object Windows1: TMenuItem
      Caption = 'Windows'
      object Horizon1: TMenuItem
        Action = WindowTileHorizontal1
      end
      object Vertical1: TMenuItem
        Action = WindowTileVertical1
      end
    end
  end
end
