select name, continent 
    from country
 where continent like '%America'
 ;
 select name, continent 
    from country
 where continent like '%america'
 ;
  select name, continent 
    from country
 where continent ilike '%america' -- iLike is a Postgres SQL extension to SQL to do a case insensetive LIKE
 ;
 select name
     from country
  where name like 'Un%'
  ;
  select name
     from country
  where name like 'Un_____A%' -- in a Like % means any 0 to any number of characters
                              --                        - means any one character
  ;
  select name
     from country
  where name like '__i%'      -- name
  ;