import request from '@/utils/request'

export function upload(file) {
  return new Promise(((resolve, reject) => {
    return request({
      url: '/common/oss/upload/policy',
      method: 'get',
      params: file
    })
  }))
}
