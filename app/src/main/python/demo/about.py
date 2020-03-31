def about():
    print("[PURPOSE]"
          "IS is a steganography tool Developed for Cryptographic"
          "Algorithms in AVPTI's Computer Department"
          "for Fall 2019-20.Here IS stands for Image Steganography."
          ""
          ""
          "[AUTHORS]"
          "Bhatt Dhanraj,Darsandiya Manan,Duragiya Hitesh,Naliyapara Mayur."
          ""
          ""
          "[FUNCTIONALITY]"
          "IS works by generating encrypted IS data from a secret message"
          "and a secret key.It then generates a random binary number which has"
          "enough digits so that each pixel in the source image maps to a binary"
          "digit.Then,it starts encoding data into the Least Significant Bit"
          "(LSB) of every pixel that maps to a 1 in the binary number.Additionally,"
          "each pixel is only encoded in a particular RGB value,thus further"
          "spreading the encoding of the encrypted data.")
about()





