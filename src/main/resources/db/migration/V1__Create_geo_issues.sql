CREATE TABLE public.geo_issue
(
  id BIGSERIAL PRIMARY KEY NOT NULL
);
CREATE UNIQUE INDEX geo_issue_id_uq
  ON public.geo_issue (id);
COMMENT ON TABLE public.geo_issue IS 'Core table for geo-positioned issues';