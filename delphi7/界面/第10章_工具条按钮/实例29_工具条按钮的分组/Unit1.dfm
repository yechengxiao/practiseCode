object Form1: TForm1
  Left = 492
  Top = 258
  Width = 663
  Height = 247
  Caption = #24037#20855#26639#24102#19979#25289
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'MS Sans Serif'
  Font.Style = []
  Menu = mm1
  OldCreateOrder = False
  PixelsPerInch = 96
  TextHeight = 13
  object clbr1: TCoolBar
    Left = 0
    Top = 0
    Width = 647
    Height = 48
    AutoSize = True
    Bands = <
      item
        Control = tlb1
        ImageIndex = -1
        MinHeight = 21
        Width = 647
      end
      item
        Control = tlb2
        ImageIndex = -1
        MinHeight = 21
        Width = 647
      end>
    EdgeBorders = [ebTop, ebBottom]
    object tlb1: TToolBar
      Left = 9
      Top = 0
      Width = 634
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
        Caption = #25991#20214
        Grouped = True
        MenuItem = mniN1
      end
      object btn2: TToolButton
        Left = 31
        Top = 0
        Caption = #32534#36753
        Grouped = True
        MenuItem = mniN2
      end
      object btn3: TToolButton
        Left = 62
        Top = 0
        Caption = #24110#21161
        Grouped = True
        MenuItem = mniN3
      end
    end
    object tlb2: TToolBar
      Left = 9
      Top = 23
      Width = 634
      Height = 21
      AutoSize = True
      ButtonHeight = 21
      ButtonWidth = 37
      Caption = 'tlb2'
      EdgeBorders = []
      Flat = True
      ShowCaptions = True
      TabOrder = 1
      object btn4: TToolButton
        Left = 0
        Top = 0
        Caption = #25171#24320
        DropdownMenu = pm1
        ImageIndex = 0
        Style = tbsDropDown
        OnClick = btn4Click
      end
      object btn5: TToolButton
        Left = 54
        Top = 0
        Caption = #25171#24320'1'
        DropdownMenu = pm1
        ImageIndex = 1
        Style = tbsDropDown
      end
      object btn6: TToolButton
        Left = 108
        Top = 0
        Width = 8
        Caption = 'btn6'
        ImageIndex = 2
        Style = tbsSeparator
      end
      object btn7: TToolButton
        Left = 116
        Top = 0
        AllowAllUp = True
        Caption = #22797#21046
        Grouped = True
        ImageIndex = 2
        Style = tbsCheck
      end
      object btn8: TToolButton
        Left = 153
        Top = 0
        AllowAllUp = True
        Caption = #21098#20999
        Grouped = True
        ImageIndex = 3
        Style = tbsCheck
      end
      object btn9: TToolButton
        Left = 190
        Top = 0
        AllowAllUp = True
        Caption = #31896#36148
        Grouped = True
        ImageIndex = 4
        Style = tbsCheck
      end
      object btn10: TToolButton
        Left = 227
        Top = 0
        Width = 8
        Caption = 'btn10'
        ImageIndex = 5
        Style = tbsSeparator
      end
      object btn11: TToolButton
        Left = 235
        Top = 0
        Caption = 'btn11'
        ImageIndex = 5
      end
    end
  end
  object StatusBar1: TStatusBar
    Left = 0
    Top = 170
    Width = 647
    Height = 19
    Panels = <
      item
        Width = 50
      end
      item
        Width = 50
      end
      item
        Width = 50
      end
      item
        Width = 50
      end>
  end
  object pnl1: TPanel
    Left = 0
    Top = 48
    Width = 647
    Height = 122
    Align = alClient
    Color = clGrayText
    TabOrder = 2
  end
  object mm1: TMainMenu
    AutoMerge = True
    Left = 202
    Top = 89
    object mniN1: TMenuItem
      Caption = #25991#20214
      object mniN4: TMenuItem
        Caption = #25171#24320
      end
    end
    object mniN2: TMenuItem
      Caption = #32534#36753
      object mniN5: TMenuItem
        Caption = #22797#21046
      end
    end
    object mniN3: TMenuItem
      Caption = #24110#21161
      object mniN6: TMenuItem
        Caption = #20851#20110
      end
    end
  end
  object pm1: TPopupMenu
    Left = 80
    Top = 88
    object mniN7: TMenuItem
      Caption = #25991#26412#25991#20214
      Default = True
      OnClick = mniN7Click
    end
    object mniWord1: TMenuItem
      Caption = 'Word'#25991#20214
    end
    object mniN8: TMenuItem
      Caption = '-'
    end
    object mniN9: TMenuItem
      Caption = #22270#20687#25991#20214
    end
    object mniN10: TMenuItem
      Caption = '-'
    end
    object mniN11: TMenuItem
      Caption = #24433#38899#25991#20214
    end
  end
end
