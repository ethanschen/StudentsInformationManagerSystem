#/bin/sh

ls_date=`date +%Y%m%d_%H%M%S`
#echo ${ls_date}
git add -A .
git commit -m "kareza ${ls_date}"
git push -u origin master
