object frmLabel1: TfrmLabel1
  Left = 624
  Top = 190
  Width = 524
  Height = 287
  Caption = #26631#31614#25511#20214#30340#36816#29992
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'MS Sans Serif'
  Font.Style = []
  OldCreateOrder = False
  PixelsPerInch = 96
  TextHeight = 13
  object lblDown: TLabel
    Left = 53
    Top = 47
    Width = 416
    Height = 33
    Caption = #27426#36814#36827#20837#31243#24207#35774#35745#30340#31070#22855#39046#22495
    Font.Charset = GB2312_CHARSET
    Font.Color = clBlack
    Font.Height = -32
    Font.Name = #38582#20070
    Font.Style = []
    ParentFont = False
  end
  object lblUp: TLabel
    Left = 53
    Top = 47
    Width = 416
    Height = 33
    Caption = #27426#36814#36827#20837#31243#24207#35774#35745#30340#31070#22855#39046#22495
    Font.Charset = GB2312_CHARSET
    Font.Color = clYellow
    Font.Height = -32
    Font.Name = #38582#20070
    Font.Style = []
    ParentFont = False
    Transparent = True
  end
  object btnLeft: TButton
    Left = 181
    Top = 106
    Width = 72
    Height = 24
    Caption = #24038#20809#28304'(&L)'
    TabOrder = 0
    OnClick = btnLeftClick
  end
  object BtnRight: TButton
    Left = 265
    Top = 106
    Width = 72
    Height = 24
    Caption = #21491#20809#28304'(&R)'
    TabOrder = 1
    OnClick = BtnRightClick
  end
  object Edit1: TEdit
    Left = 193
    Top = 162
    Width = 121
    Height = 21
    TabOrder = 2
    Text = 'Edit1'
    OnChange = Edit1Change
    OnKeyPress = Edit1KeyPress
  end
  object MaskEdit1: TMaskEdit
    Left = 194
    Top = 211
    Width = 120
    Height = 21
    EditMask = '!99/99/00;1;_'
    MaxLength = 8
    TabOrder = 3
    Text = '  -  -  '
  end
end
