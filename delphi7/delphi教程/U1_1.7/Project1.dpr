program Project1;

{$APPTYPE CONSOLE} //�������̨��ʽ�����Ǵ��巽ʽ
var
  s, n: Integer;
begin
  // �� 0~n �������ż��

  write('n=?');
  Readln(n);
  //    s := 1;
  //    while s < n do
  //    begin
  //      if s mod 2 = 0 then
  //      begin
  //        Writeln(s);
  //      end;
  //      s := s + 1;
  //    end;

  s := n - 1;
  while s > 1 do
  begin
    if not (s mod 2 = 0) then
    begin
      Writeln(s);
    end;
    s := s - 1;
  end;

  Readln; //�ȴ��������
end.

