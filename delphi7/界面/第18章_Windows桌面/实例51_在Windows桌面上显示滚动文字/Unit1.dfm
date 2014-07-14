object Form1: TForm1
  Left = 495
  Top = 373
  BorderStyle = bsNone
  Caption = ' '#26700#38754#19978#30340#28378#21160#25991#23383
  ClientHeight = 158
  ClientWidth = 596
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'MS Sans Serif'
  Font.Style = []
  OldCreateOrder = False
  OnCreate = FormCreate
  PixelsPerInch = 96
  TextHeight = 13
  object lbl1: TLabel
    Left = 190
    Top = 67
    Width = 168
    Height = 27
    Caption = #36825#26159#28378#21160#25991#23383
    Font.Charset = ANSI_CHARSET
    Font.Color = clWindowText
    Font.Height = -27
    Font.Name = #23435#20307
    Font.Style = [fsBold]
    ParentFont = False
    Transparent = True
  end
  object tmr1: TTimer
    Interval = 500
    OnTimer = tmr1Timer
    Left = 58
    Top = 32
  end
end
