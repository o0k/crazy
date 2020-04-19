select distinct a.Email from Person a join person b on a.Email=b.Email
where a.Id<>b.Id and a.Email=b.Email;