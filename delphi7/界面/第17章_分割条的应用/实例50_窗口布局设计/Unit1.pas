unit Unit1;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, ExtCtrls, ComCtrls, StdCtrls;

type
  TForm1 = class(TForm)
    pnl1: TPanel;
    Splitter1: TSplitter;
    pnl2: TPanel;
    tv1: TTreeView;
    mmo1: TMemo;
    mmo2: TMemo;
    Splitter2: TSplitter;
    procedure tv1Change(Sender: TObject; Node: TTreeNode);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  Form1: TForm1;

implementation

{$R *.dfm}

procedure TForm1.tv1Change(Sender: TObject; Node: TTreeNode);
begin
  mmo1.Clear;
  mmo1.Lines.Add('选中了' + tv1.Selected.Text + '节点');

  mmo2.Clear;
  mmo2.Lines.Add('选中了' + tv1.Selected.Text + '节点');
end;

end.

